package br.com.bestbrewer.persistence.repository

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import br.com.bestbrewer.persistence.entity.Word
import br.com.bestbrewer.persistence.dao.WordDao

class WordRepository(private val wordDao: WordDao) {

    val allWords: LiveData<List<Word>> = wordDao.getAllWords()

    @WorkerThread
    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }

}