import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PortfolioService {

  constructor() { }

/** à stocker dans srping crud */

skillsData: any = [
  {
    'id': '1',
    'skill': 'HTML',
    'progress': '70%',
    'icon': 'fab fa-html5'
  },
  {
    'id': '2',
    'skill': 'CSS3',
    'progress': '80%',
    'icon': 'fab fa-css3-alt'
  },
  {
    'id': '3',
    'skill': 'JAVASCRIPT JQUERY',
    'progress': '80%',
    'icon': 'fab fa-js'
  },
  {
    'id': '4',
    'skill': 'JAVA,J2EE',
    'progress': '75%',
    'icon': 'fab fa-java'
  }
];


skills(): Observable<any> {
  // return this.http.get(this.baseUrl + 'skills');
  return this.skillsData;
}

}
