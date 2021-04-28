 package com.example.adopet

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.adopet.enum.UserGender
import com.example.adopet.enum.YesOrNoEnum
import com.example.adopet.helper.FillSpinner
import com.example.adopet.helper.MyMaskEditText
import com.example.adopet.helper.TextViewCustomFilter
import com.google.android.material.snackbar.Snackbar


 /**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val bornDate = view.findViewById<TextView>(R.id.textview_born_date) as EditText
        val genderSpinner = view.findViewById(R.id.spinner_gender) as Spinner
        val hasOtherAnimalsSpinner = view.findViewById(R.id.spinner_has_other_animals) as Spinner
        val nameEditText = view.findViewById<TextView>(R.id.textview_person_name) as EditText
        val emailEditText = view.findViewById<TextView>(R.id.textview_email) as EditText



        fun EditText.myCustomMask(mask: String) {
            addTextChangedListener(MyMaskEditText(bornDate, mask))}


        view.findViewById<Button>(R.id.random_button).setOnClickListener {
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(1)
            if (TextViewCustomFilter(emailEditText).isEmailValid()){
                toastFormOnSuccess()
                findNavController().navigate(action)
            }else{
                toastFormOnError()
            }




        }

        view.findViewById<Button>(R.id.toast_button).setOnClickListener{
            toastFormOnError()
        }

        //Prepare Date TextView
        bornDate.myCustomMask("##/##/####")

        //Set Custom Filter to TextView person_name
        TextViewCustomFilter(nameEditText).textViewMaxLenght(40)
        TextViewCustomFilter(emailEditText).textViewMaxLenght(50)

        // Fill Spinners
        callFillSpinnerHelper(genderSpinner,hasOtherAnimalsSpinner, view.context)

        view.findViewById<Button>(R.id.count_button).setOnClickListener {

        }
    }

    private fun callFillSpinnerHelper(genderSpinner : Spinner,hasOtherAnimalsSpinner : Spinner, context : Context) {
        val listYoN = arrayListOf<Any>()
        val listGender = arrayListOf<Any>()

        listGender.addAll(UserGender.values())
        listYoN.addAll(YesOrNoEnum.values())

        FillSpinner(genderSpinner).customSpinnerFiller(context, listGender)
        FillSpinner(hasOtherAnimalsSpinner).customSpinnerFiller(context, listYoN)

    }

    private fun toastFormOnError(){
        val mytToast = Toast.makeText(context, R.string.first_fragment_toast_form_on_error, Toast.LENGTH_LONG)
        mytToast.show()

    }

    private fun toastFormOnSuccess(){
        val mytToast = Toast.makeText(context, R.string.first_fragment_toast_form_on_success, Toast.LENGTH_LONG)
        mytToast.show()
    }

}