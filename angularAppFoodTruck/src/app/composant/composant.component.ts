import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-composant',
  templateUrl: './composant.component.html',
  styleUrls: ['./composant.component.sass']
})
export class ComposantComponent implements OnInit {
@Input() prenom:String; 
@Input() nom:String;

  constructor() { }

  ngOnInit(): void {
  }

}
