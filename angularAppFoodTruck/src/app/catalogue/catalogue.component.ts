import { Component, OnInit } from '@angular/core';
import { ProductService } from '../services/product.service';
import { ProduitService } from '../services/produit.service.service';
import { Product } from '../models/product';
import { Produit } from '../models/produit';

@Component({
  selector: 'app-catalogue',
  templateUrl: './catalogue.component.html',
  styleUrls: ['./catalogue.component.sass']
})
export class CatalogueComponent implements OnInit {
ListProducts : Array<Product> = new Array<Product>();
ListProduits : Array<Produit> = new Array<Produit>();
key:string="";

  constructor(private _products : ProductService, private _produits : ProduitService) {
    this._products.GetProducts().subscribe((data)=>{
      this.ListProducts = data as Product[];
      console.log(data);
    })
   }

  ngOnInit(): void {
    this._produits.GetProduits().subscribe((data)=>{
      this.ListProduits = data as Produit[];
      console.log(data);
    })
  }

  filterNameContaining(key:string){
    return this.ListProducts.filter(product=>product.productName.toLowerCase().includes(key.toLowerCase()));
  }

}
