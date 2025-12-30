import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { Users } from '../users';
import { UserService } from '../user-service';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-user-search',
  standalone:true,
  imports: [CommonModule,FormsModule],
  templateUrl: './user-search.html',
  styleUrl: './user-search.css',
})
export class UserSearch {
  id : number;
  user : Observable<Users>;
  constructor(private _userService : UserService) {}
  show() {
    this.user = this._userService.searchUser(this.id);
  }
}
