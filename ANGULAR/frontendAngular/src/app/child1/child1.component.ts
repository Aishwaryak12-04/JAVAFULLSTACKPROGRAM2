import { Component } from '@angular/core';
import { CalculatorService } from '../calculator.service';


@Component({
  selector: 'app-child1',
  templateUrl: './child1.component.html',
  styleUrls: ['./child1.component.css']
})
export class Child1Component {
  sum: number;
  sub: number;

  // Remove Factorialservic
  constructor(private calcService: CalculatorService) {
    this.sum = this.calcService.getAddition(10, 20);
    this.sub = this.calcService.getSubtraction(10, 20);
  }
}
