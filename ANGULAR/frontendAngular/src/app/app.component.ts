import { Component } from '@angular/core';
import { CalculatorService } from './calculator.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title ='frontendAngular';
  sum : number;
  constructor(private calc : CalculatorService){
    this.sum = calc.getAddition(10, 20);
  }
}