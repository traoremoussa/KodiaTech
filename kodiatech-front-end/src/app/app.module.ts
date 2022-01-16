import { PortfolioModule } from './portfolio/portfolio.module';
import { PortfolioComponent } from './portfolio/portfolio.component';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './portfolio/header/header.component';
import { FooterComponent } from './portfolio/footer/footer.component';
import { AboutComponent } from './portfolio/about/about.component';
import { CompetencesComponent } from './portfolio/competences/competences.component';
import { ContactComponent } from './portfolio/contact/contact.component';
import { ExperienceComponent } from './portfolio/experience/experience.component';
import { FormationComponent } from './portfolio/formation/formation.component';

@NgModule({
  declarations: [
    AppComponent,

  ],
  // les moudules
  imports: [
    BrowserModule,
    AppRoutingModule,PortfolioModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
