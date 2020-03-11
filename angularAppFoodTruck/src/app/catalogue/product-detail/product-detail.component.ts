import { Component, OnInit } from '@angular/core';
import{ ActivatedRoute } from "@angular/router"
import { Product } from 'src/app/models/product';
import { ProductService } from 'src/app/services/product.service';

@Component({
  selector: 'app-product-detail',
  templateUrl: './product-detail.component.html',
  styleUrls: ['./product-detail.component.sass']
})
export class ProductDetailComponent implements OnInit {
product:Product;
  constructor(private _router:ActivatedRoute,
    private _products : ProductService) {
    this._products.GetProducts().subscribe((data)=>{
      let ListProducts = data as Product[];
      this.product=ListProducts.find(element => element.productId==Number.parseInt(this._router.snapshot.paramMap.get('id')));
    })
  }

  ngOnInit(): void {
  }

}
