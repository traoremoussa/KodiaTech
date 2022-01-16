import { PortfolioService } from './../../portfolio.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-competences',
  templateUrl: './competences.component.html',
  styleUrls: ['./competences.component.css']
})
export class CompetencesComponent implements OnInit {
skills :any;
styleP():any{ return'.progress-line.html span::after {  content: 80%}';}
  constructor(private PortfolioService:  PortfolioService) { }

  ngOnInit(): void {
    this.skills =  this.PortfolioService.skills()
  }

}
