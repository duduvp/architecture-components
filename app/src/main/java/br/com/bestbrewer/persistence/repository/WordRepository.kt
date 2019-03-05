package br.com.bestbrewer.persistence.repository

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import br.com.bestbrewer.persistence.entity.WordEntity
import br.com.bestbrewer.persistence.dao.WordDao

class WordRepository(private val wordDao: WordDao) {

    val allWords: LiveData<List<WordEntity>> = wordDao.getAllWords()

    @WorkerThread
    suspend fun insert(wordEntity: WordEntity) {
        wordDao.insert(wordEntity)
    }

}