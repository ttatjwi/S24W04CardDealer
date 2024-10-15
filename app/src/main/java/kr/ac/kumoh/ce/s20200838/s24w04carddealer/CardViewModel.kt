package kr.ac.kumoh.ce.s20200838.s24w04carddealer

import androidx.lifecycle.ViewModel
import kotlin.random.Random

//viewModel() 기억!
class CardViewModel : ViewModel() {
//    5개를 0으로 세팅해라
    private val _cards = IntArray(5) { 0 }

//    잘못 썼을 때 원인을 쉽게 파악하기 위해 복사해서 주는 것
    val cards
        get() = _cards

    fun shuffle() {
        for (i in _cards.indices)
            _cards[i] = Random.nextInt(52)
    }
}