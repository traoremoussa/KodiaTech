import { CompetencesComponent } from './competences/competences.component';
import { FormationComponent } from './formation/formation.component';
import { FooterComponent } from './footer/footer.component';
import { ExperienceComponent } from './experience/experience.component';
import { ContactComponent } from './contact/contact.component';
import { AboutComponent } from './about/about.component';
import { HeaderComponent } from './header/header.component';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { PortfolioComponent } from './portfolio.component';
import { FormsModule } from '@angular/forms';
// à connaitre
import { NgxPaginationModule } from 'ngx-pagination';



@NgModule({
  declarations: [
    PortfolioComponent,
    HeaderComponent,
    AboutComponent,
    ContactComponent,
    ExperienceComponent,
    FooterComponent,
    FormationComponent,
    CompetencesComponent,


  ],
  imports: [
    CommonModule,
    FormsModule,
    NgxPaginationModule
  ],

})
export class PortfolioModule { }
