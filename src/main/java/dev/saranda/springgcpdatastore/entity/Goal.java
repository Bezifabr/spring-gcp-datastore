package dev.saranda.springgcpdatastore.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cloud.gcp.data.datastore.core.mapping.Entity;
import org.springframework.cloud.gcp.data.datastore.core.mapping.Field;
import org.springframework.data.annotation.Id;
import java.time.LocalDate;

@Entity(name = "goals")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Goal {

    @Id
    @Field(name = "goal_id")
    private String goalId;

    @Field(name = "name")
    private String name;

    @Field(name = "why")
    private String why;

//    @Reference
//    private Goal parentGoal;

    @Field(name = "planned_due_date")
    private LocalDate plannedDueDate;

    @Field(name = "actual_due_date")
    private LocalDate actualDueDate;

}
