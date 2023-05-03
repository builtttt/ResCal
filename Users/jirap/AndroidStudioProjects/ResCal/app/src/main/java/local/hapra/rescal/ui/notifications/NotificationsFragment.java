package local.hapra.rescal.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import org.w3c.dom.Text;

import local.hapra.rescal.R;
import local.hapra.rescal.databinding.FragmentNotificationsBinding;

public class NotificationsFragment extends Fragment {

    private FragmentNotificationsBinding binding;
    private String result = "",result2 = "",result3 = "",result4 = "", result5 = "";




    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        //DashboardViewModel dashboardViewModel =
        //        new ViewModelProvider(this).get(DashboardViewModel.class);

        binding = FragmentNotificationsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        final TextView textView = binding.tvHeader;
        //  dashboardViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        TextView tvResult = root.findViewById(R.id.tvResult);

        final Button calButton = root.findViewById(R.id.button);
        calButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                String resistorValue = result+result2 + result3+ result4+"Ω\n"+result5;
                tvResult.setText(String.valueOf(resistorValue));
            }
        });

        Spinner colorArray1 = root.findViewById(R.id.colorArray1);
        Spinner colorArray2 = root.findViewById(R.id.colorArray2);
        Spinner colorArray3 = root.findViewById(R.id.colorArray3);
        Spinner colorArray4 = root.findViewById(R.id.colorArray4);
        Spinner colorArray5 = root.findViewById(R.id.colorArray5);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(requireContext(),
                R.array.colorArray, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        colorArray1.setAdapter(adapter);
        colorArray2.setAdapter(adapter);
        colorArray3.setAdapter(adapter);
        colorArray4.setAdapter(adapter);
        colorArray5.setAdapter(adapter);

        colorArray1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> colorArray1, View view,
                                       int pos, long id) {
                // An item was selected. You can retrieve the selected item using

                if (colorArray1.getItemAtPosition(pos).equals("Brown")) {
                    result = "1";
                }
                if (colorArray1.getItemAtPosition(pos).equals("Red")) {
                    result = "2";
                }
                if (colorArray1.getItemAtPosition(pos).equals("Orange")) {
                    result = "3";
                }
                if (colorArray1.getItemAtPosition(pos).equals("Yellow")) {
                    result = "4";
                }
                if (colorArray1.getItemAtPosition(pos).equals("Green")) {
                    result = "5";
                }
                if (colorArray1.getItemAtPosition(pos).equals("Blue")){
                    result = "6";
                }
                if (colorArray1.getItemAtPosition(pos).equals("Violet")){
                    result = "7";
                }
                if (colorArray1.getItemAtPosition(pos).equals("Grey")) {
                    result = "8";
                }
                if (colorArray1.getItemAtPosition(pos).equals("White")){
                    result = "9";
                }
            }
            public void onNothingSelected(AdapterView<?> parent) {
                // Another interface callback
            }

        });
        colorArray2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> colorArray2, View view,
                                       int pos, long id) {
                // An item was selected. You can retrieve the selected item using

                if (colorArray2.getItemAtPosition(pos).equals("Brown")) {
                    result2 = "1";
                }
                if (colorArray2.getItemAtPosition(pos).equals("Red")) {
                    result2 = "2";
                }
                if (colorArray2.getItemAtPosition(pos).equals("Orange")) {
                    result2 = "3";
                }
                if (colorArray2.getItemAtPosition(pos).equals("Yellow")) {
                    result2 = "4";
                }
                if (colorArray2.getItemAtPosition(pos).equals("Green")) {
                    result2 = "5";
                }
                if (colorArray2.getItemAtPosition(pos).equals("Blue")){
                    result2 = "6";
                }
                if (colorArray2.getItemAtPosition(pos).equals("Violet")){
                    result2 = "7";
                }
                if (colorArray2.getItemAtPosition(pos).equals("Grey")){
                    result2 = "8";
                }
                if (colorArray2.getItemAtPosition(pos).equals("White")){
                    result2 = "9";
                }
            }

            public void onNothingSelected(AdapterView<?> parent) {
                // Another interface callback
            }
        });
        colorArray3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> colorArray3, View view,
                                       int pos, long id) {
                // An item was selected. You can retrieve the selected item using

                if (colorArray3.getItemAtPosition(pos).equals("Brown")) {
                    result3 = "1";
                }
                if (colorArray3.getItemAtPosition(pos).equals("Red")) {
                    result3 = "2";
                }
                if (colorArray3.getItemAtPosition(pos).equals("Orange")) {
                    result3 = "3";
                }
                if (colorArray3.getItemAtPosition(pos).equals("Yellow")) {
                    result3 = "4";
                }
                if (colorArray3.getItemAtPosition(pos).equals("Green")) {
                    result3 = "5";
                }
                if (colorArray3.getItemAtPosition(pos).equals("Blue")){
                    result3 = "6";
                }
                if (colorArray3.getItemAtPosition(pos).equals("Violet")){
                    result3 = "7";
                }
                if (colorArray3.getItemAtPosition(pos).equals("Grey")){
                    result3 = "8";
                }
                if (colorArray3.getItemAtPosition(pos).equals("White")){
                    result3 = "9";
                }
            }

            public void onNothingSelected(AdapterView<?> parent) {
                // Another interface callback
            }
        });

        colorArray4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> colorArray4, View view,
                                       int pos, long id) {
                // An item was selected. You can retrieve the selected item using
                if (colorArray4.getItemAtPosition(pos).equals("Black")) {
                    result4 = result4;
                }
                if (colorArray4.getItemAtPosition(pos).equals("Brown")){
                    result4 = "0 ";
                }
                if (colorArray4.getItemAtPosition(pos).equals("Red")) {
                    result4 = "00 ";
                }
                if (colorArray4.getItemAtPosition(pos).equals("Orange")) {
                    result4 = " K";
                }
                if (colorArray4.getItemAtPosition(pos).equals("Yellow")) {
                    result4 = "0 K";
                }
                if (colorArray4.getItemAtPosition(pos).equals("Green")) {
                    result4 = "00 K";
                }
                if (colorArray4.getItemAtPosition(pos).equals("Blue")){
                    result4 = " M";
                }
                if (colorArray4.getItemAtPosition(pos).equals("Violet")){
                    result4 = "0 M";
                }
                if (colorArray4.getItemAtPosition(pos).equals("Grey")){
                    result4 = "00 M";
                }
                if (colorArray4.getItemAtPosition(pos).equals("White")){
                    result4 = " G";
                }
                if (colorArray4.getItemAtPosition(pos).equals("Gold")){
                    result4 = "x 0.1";
                }
                if (colorArray4.getItemAtPosition(pos).equals("Sliver")){
                    result4 = "x 0.01";
                }
            }
            public void onNothingSelected(AdapterView<?> parent) {
                // Another interface callback
            }
        });
        colorArray5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> colorArray5, View view,
                                       int pos, long id) {
                // An item was selected. You can retrieve the selected item using
                if (colorArray5.getItemAtPosition(pos).equals("Black")) {
                    result5 = result4;
                }
                if (colorArray5.getItemAtPosition(pos).equals("Brown")){
                    result5 = " 1%";
                }
                if (colorArray5.getItemAtPosition(pos).equals("Red")) {
                    result5 = " 2%";
                }
                if (colorArray5.getItemAtPosition(pos).equals("Orange")) {
                    result5 = "";
                }
                if (colorArray5.getItemAtPosition(pos).equals("Yellow")) {
                    result5 = "";
                }
                if (colorArray5.getItemAtPosition(pos).equals("Green")) {
                    result5 = " 0.5%";
                }
                if (colorArray5.getItemAtPosition(pos).equals("Blue")){
                    result5 = " 0.25%";
                }
                if (colorArray5.getItemAtPosition(pos).equals("Violet")){
                    result5 = " 0.1%";
                }
                if (colorArray5.getItemAtPosition(pos).equals("Grey")){
                    result5 = " 0.05%";
                }
                if (colorArray5.getItemAtPosition(pos).equals("White")){
                    result5 = "";
                }
                if (colorArray5.getItemAtPosition(pos).equals("Gold")){
                    result5 = " 5%";
                }
                if (colorArray5.getItemAtPosition(pos).equals("Sliver")){
                    result5 = "10%";
                }
            }
            public void onNothingSelected(AdapterView<?> parent) {
                // Another interface callback
            }
        });

        return root;
    }




    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}


