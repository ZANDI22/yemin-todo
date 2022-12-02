import React, { createContext, useState, useEffect } from "react";

let user;
function registerUser(name) { };
export const UserContext = createContext({ user, registerUser });



// let UserContextProps = { user, registerUser };
// UserContext = { name, registerUser }

// interface UserProps {
//     name: string;
// }

// interface Props {
//     children?: React.ReactNode;
// }

const defaultUser = {
    name: "",
};

function UserProvider({ children }) {
    const initialUser = JSON.parse(localStorage.getItem("userPreferencesDonaClone") || JSON.stringify(defaultUser));

    const [user, setUser] = useState(initialUser);

    const registerUser = (name) => {
        setUser((prevUser) => ({ ...prevUser, name: name }));
    };

    const updateUser = useEffect(() => {
        localStorage.setItem("userPreferencesDonaClone", JSON.stringify(user));
    }, [user]);

    return <UserContext.Provider value={{ user, registerUser }}>{children}</UserContext.Provider>;
}

export default UserProvider;