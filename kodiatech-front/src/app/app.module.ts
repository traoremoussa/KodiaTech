import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './view/home/home.component';
import { UtilisateurComponent } from './view/utilisateur/utilisateur.component';
import { LoginComponent } from './view/login/login.component';
import { PortfolioComponent } from './view/portfolio/portfolio.component';
import { AboutComponent } from './portfolio/about/about.component';
import { ExperienceComponent } from './portfolio/experience/experience.component';
import { FormationComponent } from './portfolio/formation/formation.component';
import { CompetencesComponent } from './portfolio/competences/competences.component';
import { ContactComponent } from './portfolio/contact/contact.component';
import { HeaderComponent } from './portfolio/header/header.component';
import { FooterComponent } from './portfolio/footer/footer.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    UtilisateurComponent,
    LoginComponent,
    PortfolioComponent,
    AboutComponent,
    ExperienceComponent,
    FormationComponent,
    CompetencesComponent,
    ContactComponent,
    HeaderComponent,
    FooterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
