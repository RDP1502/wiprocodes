import { Component } from '@angular/core';
import { Movie } from '../movie';
import { MovieService } from '../movie-service';

@Component({
  selector: 'app-movie-component',
  imports: [],
  templateUrl: './movie-component.html',
  styleUrl: './movie-component.css'
})
export class MovieComponent {

  movies:Movie[] = []
  movieId:string = ''
  movieIdAdd:string =''
  movieNameAdd:string = ''
  movieLanguageAdd:string=''
  imdbRatingAdd:number=0 

  constructor(private movieService: MovieService){
    this.movies = this.movieService.getMovies()
  }

  delete():void{
    this.movieService.deleteByMovieId(this.movieId)
    this.movies = this.movieService.getMovies()
    this.movieId = ''
  }

  save(){
    const newMovie:Movie={
      movieId : this.movieIdAdd,
      movieName:this.movieNameAdd,
      movieLanguage: this.movieLanguageAdd,
      imdbRating:this.imdbRatingAdd

    }
    this.movieService.addMovie(newMovie)
    this.movies = this.movieService.getMovies()
    this.movieIdAdd = ''
    this.movieLanguageAdd=''
    this.movieNameAdd=''
    this.imdbRatingAdd=0
  }

  update(){
    const newMovie:Movie={
      movieId : this.movieIdAdd,
      movieName:this.movieNameAdd,
      movieLanguage: this.movieLanguageAdd,
      imdbRating:this.imdbRatingAdd
    }
    this.movieService.updateMovie(newMovie)
    this.movies = this.movieService.getMovies()
    this.movieIdAdd = ''
    this.movieLanguageAdd=''
    this.movieNameAdd=''
    this.imdbRatingAdd=0

  }

  edit(){
    const movieToEdit = this.movieService.findByMovieId(this.movieId)
    if(movieToEdit){
      this.movieIdAdd = movieToEdit?.movieId
      this.movieNameAdd = movieToEdit?.movieName
      this.movieLanguageAdd = movieToEdit?.movieLanguage
      this.imdbRatingAdd = movieToEdit?.imdbRating
    }else{
      alert("No such movie exists!")
    }
  }






}
