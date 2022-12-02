import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ExampleService {

  constructor(private httpClient: HttpClient) { }

  public getExampleText(): Observable<string> {
    return this.httpClient.get("/api/example",{ responseType: "text", observe: 'body' });
  }
}
