import { Component, OnInit } from '@angular/core';
import { Users } from '../models/users';

@Component({
  selector: 'app-inscription',
  templateUrl: './inscription.component.html',
  styleUrls: ['./inscription.component.sass']
})
export class InscriptionComponent implements OnInit {
currentUser:Users;

  constructor() { }

  ngOnInit(): void {
  }

  AddUser(){
    localStorage.setItem("IsConnected",'true');
  }

}
