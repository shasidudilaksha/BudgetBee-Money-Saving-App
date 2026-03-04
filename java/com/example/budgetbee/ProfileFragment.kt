package com.example.budgetbee

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment

class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.profilefragment, container, false)

        val btnEdit = view.findViewById<Button>(R.id.btnEditProfile)
        val btnChange = view.findViewById<Button>(R.id.btnChangePassword)
        val btnLogout = view.findViewById<Button>(R.id.btnLogout)

        btnEdit.setOnClickListener {
            Toast.makeText(requireContext(), "Edit Profile clicked", Toast.LENGTH_SHORT).show()
        }

        btnChange.setOnClickListener {
            Toast.makeText(requireContext(), "Change Password clicked", Toast.LENGTH_SHORT).show()
        }

        btnLogout.setOnClickListener {
            Toast.makeText(requireContext(), "Logout clicked", Toast.LENGTH_SHORT).show()
        }

        return view
    }
}

