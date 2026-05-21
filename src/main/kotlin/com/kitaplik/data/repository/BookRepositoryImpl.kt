package com.kitaplik.data.repository

import com.kitaplik.data.dao.BookDao
import com.kitaplik.data.entity.Book
import com.kitaplik.domain.repository.BookRepository
import kotlinx.coroutines.flow.Flow

class BookRepositoryImpl(private val bookDao: BookDao) : BookRepository {
    
    override suspend fun addBook(book: Book): Long = bookDao.insertBook(book)
    
    override suspend fun updateBook(book: Book) = bookDao.updateBook(book)
    
    override suspend fun deleteBook(bookId: Long) = bookDao.deleteBookById(bookId)
    
    override fun getAllBooks(): Flow<List<Book>> = bookDao.getAllBooks()
    
    override fun getBookById(bookId: Long): Flow<Book> = bookDao.getBookById(bookId)
    
    override fun searchBooks(query: String): Flow<List<Book>> = bookDao.searchBooks(query)
}
