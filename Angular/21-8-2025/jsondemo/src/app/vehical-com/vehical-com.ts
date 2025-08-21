import { ChangeDetectorRef, Component } from '@angular/core';
import { VehicalService } from '../vehical-service';
import { Vehical } from '../vehical';
import { findIndex } from 'rxjs';
import { CurrencyPipe } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-vehical-com',
  imports: [CurrencyPipe, FormsModule],
  templateUrl: './vehical-com.html',
  styleUrl: './vehical-com.css'
})
export class VehicalCom {
  constructor(private vehicalService:VehicalService , private cdr:ChangeDetectorRef){

  }
  vehicals:Vehical[]= []
  vehicalEdit:Vehical={
    id:'',
    make:'',
    model:'',
    fuleType:'',
    price:0
  }
   vehicalAdd:Vehical={
    id:'',
    make:'',
    model:'',
    fuleType:'',
    price:0
  }


  
  ngOnInit(){
    this.vehicalService.getVehicals().subscribe((data:Vehical[])=>{
      
      this.vehicals = data
      this.cdr.detectChanges()
      console.log(this.vehicals)
    } , (error)=>{
      console.log("Error fetching vehicals", error)
    }
  )
  }

  edit(vehicalId:string){
    this.vehicalService.getVehicalsById(vehicalId).subscribe((data:Vehical)=>{
      this.vehicalEdit={...data};
      this.cdr.detectChanges();
    }, (error)=>{
      console.log("Error fetching vehical by Id", error)
    }) 
  }

  update(){
    this.vehicalService.updateVehical(this.vehicalEdit).subscribe((updatedVehical:Vehical)=>{
      const index = this.vehicals.findIndex(vehical=> vehical.id === updatedVehical.id);
      if(index!== -1){
        this.vehicals[index]=updatedVehical;
      }
      this.vehicalEdit ={
        id:'',
        make:'',
        model:'',
        fuleType:'',
        price:0
      }
      this.cdr.detectChanges();
      this.ngOnInit();
    }, (error)=>{
      console.log("Error updating vehical", error)
    })
  }

  delete(vehicalId:string){
    this.vehicalService.deleteVehical(vehicalId).subscribe(()=>{
      this.vehicals = this.vehicals.filter(vehical => vehical.id !== vehicalId);
      this.cdr.detectChanges();
      this.ngOnInit();
    },(error)=>{
      console.log("Error deleting vehical", error);
    })

  }

  save(){
    this.vehicalService.saveVehical(this.vehicalAdd).subscribe((newVehical:Vehical)=>{
      this.vehicals.push(newVehical);
      this.vehicalAdd = {
        id: '',
        model:'',
        make:'',
        fuleType:'',
        price:0
      }
      this.cdr.detectChanges(); 
    }, (error)=>{
      console.log("Error saving new vehical", error)
    })
  }


}
