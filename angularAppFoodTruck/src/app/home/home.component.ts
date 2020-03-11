import { Component, OnInit } from '@angular/core';
import { Actualite } from '../models/actualite';
import { ActualiteService } from '../services/actualite.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.sass']
})
export class HomeComponent implements OnInit {
  listActus : Array<Actualite> = new Array<Actualite>();

  constructor(private _products : ActualiteService) {
  }
  
  ngOnInit(): void {
    this._products.GetActus().subscribe((data)=>{
      this.listActus = data as Actualite[];
      console.log(data);
    })
    
  }

}
