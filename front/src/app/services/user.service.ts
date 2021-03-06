import {HttpClient, HttpEvent} from '@angular/common/http';
import { Injectable } from '@angular/core';
// import { resolve } from 'dns';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment.prod';
import { User } from '../models/User.model';
import {Post} from '../models/Post.model';

@Injectable({
    providedIn: 'root'
})
export class UserService {

    constructor(private httpClient: HttpClient) { }

    getById(id: number): Observable<User> {
        return this.httpClient.get<User>(environment.apiBaseUrl + `user/${id}`);
    }

    getMe(): Observable<User> {
        return this.httpClient.get<User>(environment.apiBaseUrl + 'user/me');
    }

    update(user: User): Observable<User> {
        return this.httpClient.put<User>(environment.apiBaseUrl + 'user/me', user);
    }

    updateProfilePicture(picture: FormData): Observable<User> {
        return this.httpClient.post<User>(environment.apiBaseUrl + 'user/me/avatar', picture);
    }

    getPostsById(id: number): Observable<Array<Post>> {
        return this.httpClient.get<Array<Post>>(environment.apiBaseUrl + `user/${id}/posts`);
    }

    getUsersGlobalLeaderboard(): Observable<Array<User>> {
        return this.httpClient.get<Array<User>>(environment.apiBaseUrl + 'user/leaderboard');
    }

}
