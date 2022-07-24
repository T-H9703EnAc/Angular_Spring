import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { USERS } from '../mock-users';
import { User } from '../user';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css']
})
export class UsersComponent implements OnInit {
  private getUrl = "http://localhost:8080/api/user/getUser";
  users: User[];
  constructor(private http: HttpClient) { }

  ngOnInit(): void {
  }
  getUserMock(): void{
    this.users = USERS;
  }
  getUser(): void{
    this.http.get<User[]>(this.getUrl)
    .subscribe(users => this.users = users);
  }

}
