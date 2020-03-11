
import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ActualiteService {
  private _actuUrl = "http://localhost:8080/actus/findAll";

  constructor(private _http:HttpClient) { }

  GetActus (){
    return this._http.get(this._actuUrl);
  }
}
