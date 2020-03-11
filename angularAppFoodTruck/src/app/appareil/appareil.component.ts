import { Component, OnChanges, Input, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-appareil',
  templateUrl: './appareil.component.html',
  styleUrls: ['./appareil.component.sass']
})
export class AppareilComponent implements OnChanges {
  constructor() {}

  ngOnChanges(): void {
  }

  appareilName:string = "Machine à laver";
  appareilStatus:String = "éteint";
  @Input() userName: string;
  @Input() lastName: string;
  @Output() ratingUserName:EventEmitter<string> = new EventEmitter<string>();
  @Output() ratingLastName:EventEmitter<string> = new EventEmitter<string>();

  NotifyUserName(){
    console.log(this.userName);
    this.ratingUserName.emit(this.userName);
  }

  NotifyLastName(){
    console.log(this.lastName);
    this.ratingLastName.emit(this.lastName);
  }

}
