import React, { createContext, useState } from "react";

export const PathContext = createContext({});

// interface PathContextProps {
//     path: string;
//     changePath: (path: string) => void;
// }

// interface Props {
//     children?: React.ReactNode;
// }

function CategoriesProvider({ children }) {
    const initialPath = "/";

    const [path, setPath] = useState(initialPath);

    const changePath = (path) => {
        setPath(path);
    };

    return <PathContext.Provider value={{ path, changePath }}>{children}</PathContext.Provider>;
}

export default CategoriesProvider;