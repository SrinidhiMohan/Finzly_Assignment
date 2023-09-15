import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-primenumber',
  templateUrl: './primenumber.component.html',
  styleUrls: ['./primenumber.component.css']
})

export class PrimenumberComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  
  result:string="Click the button for result";

  checkPrime(userData:any){
    let number = +userData,countNotPrime=0;
    for(let i=2; i < number;i++){
      if(number%i ==0){
        countNotPrime++;
      }

    }
    if(countNotPrime!=0){
      console.log("The number is not prime");
      this.result="The number is not prime";
    }else{
      console.log("The number is prime");
      this.result="The number is prime";
    }
  }

  
}
