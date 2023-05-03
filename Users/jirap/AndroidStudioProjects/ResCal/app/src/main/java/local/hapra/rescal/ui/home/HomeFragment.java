package local.hapra.rescal.ui.home;

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
import local.hapra.rescal.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private String result = "",result2 = "",result3 = "";




    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
       // HomeViewModel homeViewModel =
      //          new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        final TextView textView = binding.tvHeader;
       // homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        TextView tvResult = root.findViewById(R.id.tvResult);

        final Button calButton = root.findViewById(R.id.button);
        calButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                String resistorValue = result+result2+" " + result3+"Ω\n";
                tvResult.setText(String.valueOf(resistorValue));
            }
        });

        Spinner colorArray1 = root.findViewById(R.id.colorArray1);
        Spinner colorArray2 = root.findViewById(R.id.colorArray2);
        Spinner colorArray3 = root.findViewById(R.id.colorArray3);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(requireContext(),
                R.array.colorArray, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        colorArray1.setAdapter(adapter);
        colorArray2.setAdapter(adapter);
        colorArray3.setAdapter(adapter);

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
                if (colorArray3.getItemAtPosition(pos).equals("Black")) {
                    result3 = result3;
                }
                if (colorArray3.getItemAtPosition(pos).equals("Brown")){
                    result3 = "0";
                }
                if (colorArray3.getItemAtPosition(pos).equals("Red")) {
                    result3 = "00";
                }
                if (colorArray3.getItemAtPosition(pos).equals("Orange")) {
                    result3 = "000";
                }
                if (colorArray3.getItemAtPosition(pos).equals("Yellow")) {
                    result3 = "K";
                }
                if (colorArray3.getItemAtPosition(pos).equals("Green")) {
                    result3 = "0K";
                }
                if (colorArray3.getItemAtPosition(pos).equals("Blue")){
                    result3 = "00K";
                }
                if (colorArray3.getItemAtPosition(pos).equals("Violet")){
                    result3 = "M";
                }
                if (colorArray3.getItemAtPosition(pos).equals("Grey")){
                    result3 = "0M";
                }
                if (colorArray3.getItemAtPosition(pos).equals("White")){
                    result3 = "00M";
                }
                if (colorArray3.getItemAtPosition(pos).equals("Gold")){
                    result3 = "x 0.1";
                }
                if (colorArray3.getItemAtPosition(pos).equals("Sliver")){
                    result3 = "x 0.01";
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


