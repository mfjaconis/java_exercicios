import { fireEvent, render, screen } from "@testing-library/react";
import Post from "..";

describe("Tests for PostComments component", () => {
	test("Must add two comments", () => {
		render(<Post />);
		const input = screen.getByTestId("textarea-input");
		const button = screen.getByTestId("btn-submit");
		fireEvent.change(input, {
			target: {
				value: "Muito bom!",
			},
		});
		fireEvent.click(button);
		fireEvent.change(input, {
			target: {
				value: "Foi incrível!",
			},
		});
		fireEvent.click(button);
		expect(screen.getByText("Muito bom!")).toBeInTheDocument();
		expect(screen.getByText("Foi incrível!")).toBeInTheDocument();
	});
});
