package br.com.bestbrewer.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import br.com.bestbrewer.persistence.AppDatabase
//import br.com.bestbrewer.persistence.entity.old.WordEntity
//import br.com.bestbrewer.persistence.repository.WordRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

class WordViewModel(application: Application) : AndroidViewModel(application) {

    private var parentJob = Job()
    private val coroutineContext: CoroutineContext
        get() = parentJob + Dispatchers.Main
    private val scope = CoroutineScope(coroutineContext)

   /* private val repository: WordRepository
    val allWords: LiveData<List<WordEntity>>

    init {
        val wordsDao = AppDatabase.getDatabase(application, scope).wordDao()
        repository = WordRepository(wordsDao)
        allWords = repository.allWords
    }

    fun insert(wordEntity: WordEntity) = scope.launch(Dispatchers.IO) {
        repository.insert(wordEntity)
    }*/

    override fun onCleared() {
        super.onCleared()
        parentJob.cancel()
    }
}