package com.example.studio2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_change.*

class ChangeActivity : AppCompatActivity() {

    var fragment: Fragment = DepositFragment()
    var fragmentType = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change)

        initDeposit()
    }

    private fun initDeposit() {
        fragment = DepositFragment()
        fragmentType = 0
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.contaner, fragment)
        transaction.commit()
    }

    private fun initWithdrawal() {
        fragment = WithdrawFragment()
        fragmentType = 1
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.contaner, fragment)
        transaction.commit()
    }

    public fun changeFragment(view: View?) {
        if (fragmentType == 0) {
            initWithdrawal()
        } else {
            initDeposit()
        }
    }

}
