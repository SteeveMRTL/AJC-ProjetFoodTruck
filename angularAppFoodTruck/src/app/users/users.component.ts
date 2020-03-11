import { Component, OnInit } from '@angular/core';
import { UsersService } from '../services/users.service';
import { Users } from '../models/users';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.sass']
})
export class UsersComponent implements OnInit {
  ListUsers : Array<Users> = new Array<Users>();

  constructor(private _users : UsersService) {
    this._users.GetUsers().subscribe((data)=>{
      this.ListUsers = data as Users[];
      console.log(data);
    })
   }

  ngOnInit(): void {
  }

}
