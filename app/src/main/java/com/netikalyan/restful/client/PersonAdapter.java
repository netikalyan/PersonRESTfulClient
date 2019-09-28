/*
 * MIT License
 *
 * Copyright (c) 2019 KK
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.netikalyan.restful.client;

import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.netikalyan.restful.model.Person;

import java.util.List;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.PersonViewHolder> {

    private final List<Person> mPersonList;
    private Context mContext;

    PersonAdapter(Context context, List<Person> list) {
        mContext = context;
        mPersonList = list;
    }

    class PersonViewHolder extends RecyclerView.ViewHolder {
        TextView nameView;
        TextView ageView;
        TextView idView;

        PersonViewHolder(@NonNull View itemView) {
            super(itemView);
            nameView = itemView.findViewById(R.id.textName);
            ageView = itemView.findViewById(R.id.textAge);
            idView = itemView.findViewById(R.id.textID);
        }
    }

    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerlist_item, parent, false);
        return new PersonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int position) {
        if (position == 0) {
            // Need to use TypedValue.COMPLEX_UNIT_PX as the unit, since Resource dimension value
            // is already multiplied by the appropriate metric to convert into pixels.
            holder.idView.setText(mContext.getString(R.string.text_id));
            holder.idView.setTextSize(TypedValue.COMPLEX_UNIT_PX, mContext.getResources().getDimension(R.dimen.heading_size));
            holder.nameView.setText(mContext.getString(R.string.text_name));
            holder.nameView.setTextSize(TypedValue.COMPLEX_UNIT_PX, mContext.getResources().getDimension(R.dimen.heading_size));
            holder.ageView.setText(mContext.getString(R.string.text_age));
            holder.ageView.setTextSize(TypedValue.COMPLEX_UNIT_PX, mContext.getResources().getDimension(R.dimen.heading_size));
        } else {
            holder.idView.setText(String.valueOf(mPersonList.get(position - 1).getId()));
            holder.nameView.setText(mPersonList.get(position - 1).getName());
            holder.ageView.setText(String.valueOf(mPersonList.get(position - 1).getAge()));
        }
    }

    @Override
    public int getItemCount() {
        return mPersonList.size() + 1;
    }
}
