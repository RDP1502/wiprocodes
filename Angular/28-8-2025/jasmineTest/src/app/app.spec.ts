import { Component } from "@angular/core";
import { App } from "./app";
 
describe(("App Test"),()=>{
    var component:App;
 
    beforeEach(()=>{
     component= new App();
 
    })

     it("is Palindrome", ()=>{
    let result = component.isPalindrome('madam');
    expect(result).toBe(true)
  })
  })

 