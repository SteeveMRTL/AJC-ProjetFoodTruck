import { Component, OnInit } from '@angular/core';
import { Personne } from '../models/personne';
import { FormControl, FormGroup, FormBuilder, Validators } from "@angular/forms";

@Component({
  selector: 'app-reactive-form',
  templateUrl: './reactive-form.component.html',
  styleUrls: ['./reactive-form.component.sass']
})
export class ReactiveFormComponent implements OnInit {
//attributs liés au Template-driven Form Control
  currentUser : Personne = new Personne();
  personnes:Personne[]=[];

//attributs liés au reactive Form Control
userTitleControl = new FormControl();
userDescriptionControl = new FormControl();

  constructor(private _formbuilder:FormBuilder) {}

  userForm = new FormGroup({
    email: new FormControl(),
    prenom: new FormControl(),
    nom: new FormControl(),
    mdp: new FormControl(null, [
    Validators.required
    ]),
    dateDeNaissance: new FormControl(),
    profil: new FormControl()
    });

  ngOnInit(): void {
  }

  submitUser() {
    console.log(this.userForm.value);
    }

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
