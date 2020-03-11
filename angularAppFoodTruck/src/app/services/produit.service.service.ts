import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProduitService {

  private _productUrl = "http://localhost:8080/produit/findAll";

  constructor(private _http:HttpClient) { }

  GetProduits(){
    return this._http.get(this._productUrl);
  }
}
