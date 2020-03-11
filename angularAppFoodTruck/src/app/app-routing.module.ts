import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { UsersComponent } from './users/users.component';
import { CatalogueComponent } from './catalogue/catalogue.component';
import { InscriptionComponent } from './inscription/inscription.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { ProductDetailComponent } from './catalogue/product-detail/product-detail.component';
import { GuardNameGuard } from './guard-name.guard';


const routes: Routes = [
  {path : "home", component : HomeComponent},
  {path : "", redirectTo : "home", pathMatch:"full"},
  {path : "users", component : UsersComponent},
  {path : "catalogue", component : CatalogueComponent,
  canActivate : [GuardNameGuard]
  },
  {path : "catalogue/:id", component : ProductDetailComponent},
  {path : "inscription", component : InscriptionComponent},
  {path : "**", component : PageNotFoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }