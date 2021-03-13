/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.util.ArrayList;

/**
 *
 * @author José Manuel Rubio Serrano
 * @version 1.0
 */
public class Book {
    private String title;
    private String author;
    private String editorial;
    private String age;
    ArrayList<String> genres;
    /**
     * Constructor de la clase book. Inicializa la lista de estilos literarios.
     */
    public Book (){
    ArrayList<String> genres = new ArrayList<>();
    } 
    /**
     * Método setTitle. Recibe un String.
     * @param title Título del libro.
     */
    public void setTitle(String title) {
        this.title = title;
    }
    /**
     * Método setAuthor. Recibe el nombre del autor.
     * @param author Nombre del autor.
     */
    public void setAuthor(String author) {
        this.author = author;
    }
    /**
     * Método setEditorial. Recibe el nombre de la editorial.
     * @param editorial Nombre de la editorial
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    /**
     * Método setAge. Recibe la edad recomendada.
     * @param age Edad recomendada del libro.
     */
    public void setAge(String age) {
        this.age = age;
    }
    /**
     * Método setGenres. Recibe la lista de géneros literarios.
     * @param genres Géneros literarios.
     */
    public void setGenres(ArrayList<String> genres) {
        this.genres = genres;
    }
    /**
     * Método getTitle. Devuelve el título del libro.
     * @return Título del libro
     */
    public String getTitle() {
        return title;
    }
    /**
     * Método getAuthor. Devuelve el nombre del autor.
     * @return Nombre del autor
     */
    public String getAuthor() {
        return author;
    }
    /**
     * Método getEditorial. Devuelve la editorial.
     * @return Nombre de la editorial.
     */
    public String getEditorial() {
        return editorial;
    }
    /**
     * Método getAge. Devuelve la edad recomendada.
     * @return Edad recomendada.
     */
    public String getAge() {
        return age;
    }
    /**
     * Método getGenres. Devuelve la el género literario.
     * @return Género literario.
     */
    public ArrayList<String> getGenres() {
        return genres;
    }
    /**
     * 
     * @return 
     */
    public String[] toArray(){
        
        return new String[]{ getTitle(), getAuthor(), getEditorial(), getAge(), String.join("-", getGenres())}; 
    }
    
}



