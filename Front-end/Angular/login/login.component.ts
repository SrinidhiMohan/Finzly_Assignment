import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
 
  constructor() { }

  ngOnInit(): void {
  }
  validateCredentials(name:string,password:any){
    
    if(name==" "){
      alert("Enter poper name");
    }
    if(password==" "){
      alert("Enter poper password");
    }
    
  }
 

}
