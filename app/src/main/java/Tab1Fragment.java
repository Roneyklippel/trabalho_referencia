

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import br.senac.es.helpdesk.R;

    public class Tab1Fragmant extends Fragment {
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

            View view =
                    inflater.inflate(R.layout.fragment_one, container, false);

            return  view;
        }
    }


