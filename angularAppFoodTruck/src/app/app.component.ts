import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.sass']
})
export class AppComponent {
  title = 'Steeve';
  isAuth:boolean=false;
  heroes = ["Windstorm","Bombasto", "Magneta","Tornadi"];
  appareils = ["Machine à laver","Lave-vaisselle","Blender","Tondeuse","Micro-ondes","Four"]
  userName="Bruce";
  firstName="Wayne";
  
  constructor(){
    setTimeout(
      ()=>{
        this.isAuth = true;
      },4000
    );
  }

  onAllumer() {
    console.log('On allume tout !');
  }

  onRatingUserNameClicked(eventValue:string){
    this.userName=eventValue;
  }

  onRatingLastNameClicked(eventValue:string){
    this.firstName=eventValue;
  }
}
