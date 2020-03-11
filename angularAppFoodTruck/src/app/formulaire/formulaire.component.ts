import { Component} from '@angular/core';
import { Personne } from '../models/personne';

@Component({
  selector: 'app-formulaire',
  templateUrl: './formulaire.component.html',
  styleUrls: ['./formulaire.component.sass']
})
export class FormulaireComponent {
currentUser : Personne = new Personne();
personnes:Personne[]=[];
title="Steeve--Martial";

  constructor() {}

addUser(){
  let p1=new Personne();
  p1.email=this.currentUser.email;
  p1.prenom=this.currentUser.prenom;
  p1.nom=this.currentUser.nom;
  p1.mdp=this.currentUser.mdp;
  p1.dateDeNaissance=this.currentUser.dateDeNaissance;
  p1.profil=this.currentUser.profil;
  this.personnes.push(p1);
  console.log(p1.id,p1.nom,p1.prenom,p1.email,p1.profil);
}

}
