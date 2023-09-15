import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-classbinding',
  templateUrl: './classbinding.component.html',
  styleUrls: ['./classbinding.component.css']
})
export class ClassbindingComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  clickedData: string = '';

  isClicked: boolean = false;

  handleClick() {
    this.isClicked = true;
  }
  handleClickEvent(eventData: string) {
    this.clickedData = eventData;
  }

}
