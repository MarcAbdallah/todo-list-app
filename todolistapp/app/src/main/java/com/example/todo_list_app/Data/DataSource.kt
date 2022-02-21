package com.example.todo_list_app.Data

import com.example.todo_list_app.R
import com.example.todo_list_app.model.Weekdays

class DataSource {
    fun loadWeekdays(): List<Weekdays>{
        return listOf<Weekdays>(
            Weekdays(R.string.Monday),
            Weekdays(R.string.Tuesday),
            Weekdays(R.string.Wednesday),
            Weekdays(R.string.Thursday),
            Weekdays(R.string.Friday),
            Weekdays(R.string.Saturday),
            Weekdays(R.string.Sunday)

        )

    }
} //this is a comment