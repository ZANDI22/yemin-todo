import React, { createContext, useState, useEffect } from "react";
let title, slug, color;
let category = { title, slug, color };
let checked, content, date, id;
let task = { category, checked, content, date, id };
let addTask, removeTask, updateCheckedStatus, updateDate, updateTaskColor, changeTasksOrder;

let tasks = new Array(task);
export const TasksContext = createContext({ tasks, addTask, removeTask, updateCheckedStatus, updateDate, updateTaskColor, changeTasksOrder });

// export interface TaskProps {
//     category: CategoryProps;
//     checked: boolean;
//     content: string;
//     date: string;
//     id: string;
// }

// interface TasksContextProps {
//     tasks: TaskProps[];
//     addTask: (newTask: TaskProps) => void;
//     removeTask: (id: string) => void;
//     updateCheckedStatus: (updatedTask: TaskProps, checked: boolean) => void;
//     updateDate: (updatedTask: TaskProps, date: string) => void;
//     updateTaskColor: (slugBeingUpdated: string, color: string) => void;
//     changeTasksOrder: (result: TaskProps[]) => void;
// }

// interface Props {
//     children?: React.ReactNode;
// }

function TasksProvider({ children }) {
    const initialTasks = JSON.parse(localStorage.getItem("userTasksDonaClone") || "[]");

    const [tasks, setTasks] = useState(initialTasks);

    const addTask = (newTask) => {
        setTasks((prevTasks) => [newTask, ...prevTasks]);
    };

    const removeTask = (id) => {
        setTasks((prevTasks) => prevTasks.filter((task) => task.id !== id));
    };

    const updateCheckedStatus = (updatedTask, checked) => {
        setTasks((prevTasks) =>
            prevTasks.map((task) => {
                if (task.id === updatedTask.id) {
                    return { ...updatedTask, checked: checked };
                }
                return task;
            }),
        );
    };

    const updateDate = (updatedTask, date) => {
        setTasks((prevTasks) =>
            prevTasks.map((task) => {
                if (task.id === updatedTask.id) {
                    return { ...updatedTask, date: date };
                }
                return task;
            }),
        );
    };

    const updateTaskColor = (slugBeingUpdated, color) => {
        setTasks((prevTasks) =>
            prevTasks.map((task) => {
                if (task.category.slug === slugBeingUpdated) {
                    return { ...task, category: { ...task.category, color: color } };
                }
                return task;
            }),
        );
    };

    const changeTasksOrder = (result) => {
        var index = 0;

        setTasks(
            tasks.map((task) => {
                if (task.category.slug === result[0].category.slug) {
                    task = result[index];
                    index++;
                }
                return task;
            }),
        );
    };

    const updateTasks = useEffect(() => {
        localStorage.setItem("userTasksDonaClone", JSON.stringify(tasks));
    }, [tasks]);

    return (
        <TasksContext.Provider
            value={{ tasks, addTask, removeTask, updateCheckedStatus, updateDate, updateTaskColor, changeTasksOrder }}
        >
            {children}
        </TasksContext.Provider>
    );
}

export default TasksProvider;