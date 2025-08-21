import { Injectable } from '@angular/core';
import { Movie } from './movie';

@Injectable({
  providedIn: 'root'
})
export class MovieService {

  movies:Movie[]=[]

  getMovies():Movie[]{
    return this.movies;
  }

  deleteByMovieId(movieId:string):void{
    this.movies = this.movies.filter((movie)=> movie.movieId !== movieId)
  }

  addMovie(movie:Movie){
    this.movies.push(movie)
  }

  findByMovieId(movieId:string):Movie | undefined{
    return this.movies.find(movie=>movie.movieId === movieId)

  }

  updateMovie(movie:Movie):void{
    const index = this.movies.findIndex(movie=> movie.movieId === movie.movieId)
    if(index !== -1){
      this.movies[index]= movie
    }else{
      console.log("Movie not found" + movie.movieId)
    }
  } 
}
