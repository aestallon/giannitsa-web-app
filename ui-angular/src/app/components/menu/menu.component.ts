import { Component, OnInit } from '@angular/core';
import { MatButton } from '@angular/material/button'
import { ExampleService } from 'src/app/services/example.service';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {
  text?: string = "foo";

  constructor(private service: ExampleService) { 
    //this.exampleText();
  }

  ngOnInit(): void {
  }

  
  exampleText() {
    this.service.getExampleText().subscribe((data: string) => this.text = data);
  }
  
  public get value() : string {
    return this.text!;
  }
  

}
