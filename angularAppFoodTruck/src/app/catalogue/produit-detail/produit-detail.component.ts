import { Component, OnInit } from '@angular/core';
import{ ActivatedRoute } from "@angular/router"
import { Produit } from 'src/app/models/produit';
import { ProduitService } from 'src/app/services/produit.service.service';

@Component({
  selector: 'app-produit-detail',
  templateUrl: './produit-detail.component.html',
  styleUrls: ['./produit-detail.component.sass']
})
export class ProduitDetailComponent implements OnInit {
produit:Produit;
  constructor(private _router:ActivatedRoute,
    private _produits : ProduitService) {
    this._produits.GetProduits().subscribe((data)=>{
      let ListProduits = data as Produit[];
      this.produit=ListProduits.find(element => element.idProduit==Number.parseInt(this._router.snapshot.paramMap.get('id')));
    })
  }

  ngOnInit(): void {
  }

}
