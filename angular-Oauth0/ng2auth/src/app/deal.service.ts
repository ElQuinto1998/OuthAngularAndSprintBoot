import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpErrorResponse } from '@angular/common/http';
import { throwError, Observable } from 'rxjs';
import { catchError } from 'rxjs/operators';
import { AuthService } from './auth/auth.service';
import { Deal } from './deal';

@Injectable()
export class DealService {
  // Define the routes we are going to interact with
  private uriPruebaPublic = 'http://localhost:3010/api/public';
  private uriPruebaSecured = 'http://localhost:3010/api/private';

  constructor(
    private http: HttpClient,
    private authService: AuthService
  ) { }

  // Implement a method to get the public deals
  getPublicDeals() {
    return this.http
      .get<Deal[]>(this.uriPruebaPublic)
      .pipe(
        catchError(this.handleError)
      );
  }

  // Implement a method to get the private deals
  getPrivateDeals() {

    console.log(this.authService.accessToken);
  
    return this.http
      .get<Deal[]>(this.uriPruebaSecured, {
        headers: new HttpHeaders().set('Authorization', `Bearer ${this.authService.accessToken}`)
      })
      .pipe(
        catchError(this.handleError)
      );

      
      
  }

  // Implement a method to handle errors if any
  private handleError(err: HttpErrorResponse | any) {
    console.error('An error occurred', err);
    return throwError(err.message || err);
  }

  purchase(item) {
    alert(`You bought the: ${item.name}`);
  }
}
