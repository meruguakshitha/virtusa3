import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { Users } from '../users';
import { UserService } from '../user-service';

@Component({
  selector: 'app-user-show',
  standalone:true,
  imports: [CommonModule],
  templateUrl: './user-show.html',
  styleUrl: './user-show.css',
})
export class UserShow {
  users : Observable<Users[]>;
  
  constructor(private _userService : UserService) {
   this.users = this._userService.showUsers();
   
  }
}
