package com.example.next.sqlitetest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by next on 23/3/17.
 */
public class ListAdapter extends BaseExpandableListAdapter

    {
        List<Datamodel> employeeList;
        List<DeptMOdel> mdeptList;
        Context context;
        HashMap<Integer,List<Datamodel>> selectdMap = new HashMap<>();
        int totalNumberOFEmployee;

        public ListAdapter(List<Datamodel> employeeList, List<DeptMOdel> deptList, Context context)
        {
            this.employeeList = employeeList;
            this.mdeptList = deptList;
            this.context = context;
        }



        @Override
        public int getGroupCount()
        {
            return mdeptList.size();
        }

        @Override
        public int getChildrenCount(int groupPosition)
        {
            List<Datamodel> selectedList = new ArrayList<>();

            String deptId = mdeptList.get(groupPosition).getDeptId();
            for (int i = 0; i < employeeList.size(); i++)
            {
                Datamodel employee = employeeList.get(i);
                if (deptId.equalsIgnoreCase(employee.getDepartmentid()))
                {

                    selectedList.add(employee);
                }
            }
            selectdMap.put(groupPosition,selectedList);
            totalNumberOFEmployee = selectedList.size();
            return selectedList.size();
        }

        @Override
        public Object getGroup(int groupPosition)
        {
            return null;
        }

        @Override
        public Object getChild(int groupPosition, int childPosition)
        {
            return null;
        }

        @Override
        public long getGroupId(int groupPosition)
        {
            return 0;
        }

        @Override
        public long getChildId(int groupPosition, int childPosition)
        {
            return 0;
        }

        @Override
        public boolean hasStableIds()
        {
            return false;
        }

        @Override
        public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent)
        {

            LayoutInflater layoutInflater = (LayoutInflater) this.context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.group_item, null);

            TextView name_text = (TextView) convertView.findViewById(R.id.dptname);
            TextView total_number = (TextView) convertView.findViewById(R.id.deptcount);
            name_text.setText(mdeptList.get(groupPosition).getDeptName());
            total_number.setText(String.valueOf(getChildrenCount(groupPosition)));

            return convertView;
        }

        @Override
        public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent)
        {
            LayoutInflater layoutInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.child_item, null);
            TextView empName = (TextView) convertView.findViewById(R.id.EmpName);
            TextView Empid = (TextView) convertView.findViewById(R.id.empid);
            List<Datamodel> employeeList = selectdMap.get(groupPosition);
            Datamodel employee = employeeList.get(childPosition);
            empName.setText(employee.getEmpname());
            Empid.setText(String.valueOf(employee.getEmpid()));
            return convertView;
        }

        @Override
        public boolean isChildSelectable(int groupPosition, int childPosition)
        {
            return true;
        }
    }

