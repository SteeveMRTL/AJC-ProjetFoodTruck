import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { Component,Input,OnInit } from '@angular/core';
import{FormsModule, ReactiveFormsModule} from "@angular/forms";
import{HttpClientModule} from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AppareilComponent } from './appareil/appareil.component';
import { FormulaireComponent } from './formulaire/formulaire.component';
import { ComposantComponent } from './composant/composant.component';
import { TableauComponent } from './tableau/tableau.component';
import { ConvertToSpacePipePipe } from './convert-to-space-pipe.pipe';
import { HomeComponent } from './home/home.component';
import { CatalogueComponent } from './catalogue/catalogue.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { InscriptionComponent } from './inscription/inscription.component';
import { UsersComponent } from './users/users.component';
import { ProductDetailComponent } from './catalogue/product-detail/product-detail.component';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';
import { ProduitDetailComponent } from './catalogue/produit-detail/produit-detail.component';

@NgModule({
  declarations: [
    AppComponent,
    AppareilComponent,
    FormulaireComponent,
    ComposantComponent,
    TableauComponent,
    ConvertToSpacePipePipe,
    HomeComponent,
    CatalogueComponent,
    PageNotFoundComponent,
    InscriptionComponent,
    UsersComponent,
    ProductDetailComponent,
    ReactiveFormComponent,
    ProduitDetailComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
